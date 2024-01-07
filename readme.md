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