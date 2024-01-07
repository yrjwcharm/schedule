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