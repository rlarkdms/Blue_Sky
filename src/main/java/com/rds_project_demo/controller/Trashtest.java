package com.rds_project_demo.controller;


import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.*;
import com.rds_project_demo.Member.Trash;
import com.rds_project_demo.repository.MemberRepository;
import com.rds_project_demo.repository.TrashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/trash")
public class Trashtest {

    @Autowired
    private TrashRepository trashRepository;

//    @GetMapping("/select/{id}/{age}") // READ
//    public Member selecttwo(@PathVariable("id") long id,@PathVariable("age") int age){
//        return (Member) memberRepository.findByIdAndAge(age,id);
//    }


    @CrossOrigin(origins="*")
    @PostMapping("/{dong}") // READ
    @ResponseBody
    public List<Trash> findAll(@PathVariable("dong") String dong){


//        List<Trash> arr=trashRepository.findBydong(dong);
//
//
//
//        for(int i=0; i<arr.size(); i++) {
//            Trash arr_trash = (Trash) arr.get(i);
//            System.out.println(arr_trash.location);
//            Float[] coords = CommonUtil.findGeoPoint(arr_trash.location);
//            System.out.println(coords);
//
//
//        }
        //String title=(String)arr_trash.get(0).get("location").toString();
//        for(int i=0; i<length(arr); i++)
//            arr.set()//        System.out.println(arr.get(0).get("location").toString());

        //System.out.println(title);
        return trashRepository.findBydong(dong);
    }

//    public static Float[] findGeoPoint(String location) {
//
//        if (location == null)
//            return null;
//
//        // setAddress : 변환하려는 주소 (경기도 성남시 분당구 등)
//        // setLanguate : 인코딩 설정
//        GeocoderRequest geocoderRequest = new GeocoderRequestBuilder().setAddress(location).setLanguage("ko").getGeocoderRequest();
//
//        try {
//            Geocoder geocoder = new Geocoder();
//            GeocodeResponse geocoderResponse = geocoder.geocode(geocoderRequest);
//
//            System.out.print("들어옴11");
//            System.out.print(geocoderResponse.getStatus());
//            System.out.print(GeocoderStatus.OK);
//
//            if (geocoderResponse.getStatus() == GeocoderStatus.OK && !geocoderResponse.getResults().isEmpty()) {
//                GeocoderResult geocoderResult=geocoderResponse.getResults().iterator().next();
//                LatLng latitudeLongitude = geocoderResult.getGeometry().getLocation();
//                System.out.print("들어옴22");
//
//                Float[] coords = new Float[2];
//                coords[0] = latitudeLongitude.getLat().floatValue();
//                coords[1] = latitudeLongitude.getLng().floatValue();
//                return coords;
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }


//
//    @CrossOrigin(origins="*")
//    @PostMapping("/select/{months}") // READ
//    public List<Member> selectOne(@PathVariable("months") int months){
//        return memberRepository.findByMonths(months);
//    }
//


    int intParser(String age){
        try{
            return Integer.parseInt(age);
        } catch(ClassCastException e){
            e.printStackTrace();
            return 0;
        }
    }
}

