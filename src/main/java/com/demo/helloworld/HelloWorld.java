//package com.demo.helloworld;
//
//import com.demo.user.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.text.DateFormat;
//import java.util.Date;
//
//@RestController
//public class HelloWorld {
//
//    @Autowired
//    MyProperties myPro;
//
////    @Autowired
////    private RedisTemplate redisTemplate;
////
//    @Autowired
////    private UserRepository userRepository;
////    @RequestMapping("/hello")
////    public String index(){
////        return "this is my tset!1";
////    }
////
//    @RequestMapping("/getuser")
//    public String  getUserRedis() {
//
////        String aa = "aa@126.com";
////        ValueOperations<String, String> operations=redisTemplate.opsForValue();
////        operations.set("com.neox", aa);
////        operations.set("com.neo.f", aa,1, TimeUnit.SECONDS);
//////        Thread.sleep(1000);
////        //redisTemplate.delete("com.neo.f");
////        boolean exists=redisTemplate.hasKey("cat");
////        if(exists){
////            System.out.println("existsts is true");
////        }else{
////            System.out.println("exists is false");
////        }
//        return  "";
//
//    }
//    public User getUser(){
//
//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
//        String formattedDate = dateFormat.format(date);
//
////        User user = userRepository.findByUserName("aa1");
//
////        userRepository.save(new User("aa11", "a1a@126.com", "a1a", "aa1234156"));
//
////        MyProperties myPro = new MyProperties();
//
////        user.setUserName(myPro.getTitle());
////        user.setPassWord(myPro.getDescription());
//        User user = new User();
//        return user;
//    }
//}
//
