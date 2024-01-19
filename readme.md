#### json转化 四种方式
### 普通方式
```java
//                    JSONArray jsonArray = JSON.parseArray(scheduleDto.getScheduleArrange());
//                    // 处理 JSONArray 对象
//                    List<ScheduleArrange> arrayList = new ArrayList<>();
//                    for (Object obj : jsonArray) {
//                        JSONObject jsonObject = (JSONObject) obj; // 转换为 JSONObject
//                        // 进行你的处理，比如获取属性值
//                        String date = jsonObject.getString("date");
//                        String content = jsonObject.getString("content");
//                        ScheduleArrange scheduleArrange = new ScheduleArrange();
//                        scheduleArrange.setContent(content);
//                        scheduleArrange.setDate(date);
//                        arrayList.add(scheduleArrange);
//                    }
```
```java
//                    JackSon
//                    ObjectMapper objectMapper = new ObjectMapper();
//                    List<ScheduleArrange> arrayList = null;
//                    try {
//                        arrayList = objectMapper.readValue(scheduleDto.getScheduleArrange(), new TypeReference<List<ScheduleArrange>>() {});
//                    } catch (JsonProcessingException e) {
//                        e.printStackTrace();
//                    }
```

```java
    //fastJson
//                    List<ScheduleArrange> arrayList = JSON.parseObject(scheduleDto.getScheduleArrange(), new TypeReference<List<ScheduleArrange>>() {});
//                    scheduleDto.setScheduleArrangeList(arrayList);


```
```java
//Gson
```

```java
//第一种方式，使用@JsonIgnore注解标注在属性上，忽略指定属性

//第二种方式，使用@JsonIgnoreProperties标注在类上，可以忽略指定集合的属性
//@JsonIgnoreProperties({"validate"}) 序列化

//第三种方法 使用fastjson时：使用@JSONField(serialize = false)注解
//第四种方法 加上 @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) ：前端就不能接收到

//如果是null不返回，注解:@JsonInclude(value= JsonInclude.Include.NON_NULL) 返回的字段属性为null 就不会展示给前端...可以放在类上，也可以放在字段上!
//@JsonInclude(value= JsonInclude.Include.NON_NULL)


//@JsonIgnoreProperties({"scheduleArrange"})

```

>>> 在Spring Boot中，通过application.properties或application.yml配置文件设置如下内容：
```

@Async注解的方法默认情况下确实会在线程池中执行，而不是在调用线程中同步执行。但是，如果不显示地配置线程池大小，Spring Boot将使用其默认的异步任务执行器（如SimpleAsyncTaskExecutor），这个执行器对于每个方法调用都会创建一个新的线程去执行。

然而，即使在这种情况下，如果多个异步方法同时被调用，这些方法仍然会在各自独立的线程中并行执行，而不是串行执行。至于它们之间具体的执行顺序是不确定的，取决于操作系统的线程调度策略。

若要控制并发数量或调整线程池大小，可以自定义一个ThreadPoolTaskExecutor或ScheduledThreadPoolExecutor，然后在配置类中将其注入到Spring容器，并通过设置corePoolSize、maxPoolSize等参数来控制线程池的行为。

这意味着你配置了Spring的任务调度器（TaskScheduler）线程池大小为1。请注意，这并不直接影响到使用@Async注解的方法的执行方式，因为@Async方法默认使用的不是任务调度器的线程池，而是异步任务执行器（比如SimpleAsyncTaskExecutor或其他自定义的TaskExecutor）。

若要让@Async方法也使用这个配置的线程池来执行，你需要创建一个与之关联的ThreadPoolTaskExecutor，并将其注入到Spring容器中：
```

```yaml
spring:
  task:
    scheduling:
      pool:
        size: 1
```
```java
@Configuration
@EnableAsync
public class AsyncConfig {

    @Bean
    public TaskExecutor taskExecutor(AsyncProperties asyncProperties) {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(asyncProperties.getTask().getExecution().getPool().getSize());
        // 可能还需要设置其他属性，如最大线程数、队列容量等
        executor.initialize();
        return executor;
    }
}
```