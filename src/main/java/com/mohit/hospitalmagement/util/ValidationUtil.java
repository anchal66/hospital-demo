package com.mohit.hospitalmagement.util;

import com.mohit.hospitalmagement.dto.DoctorRequest;

public class ValidationUtil {
    public static void validateDoctorReq(DoctorRequest doctorRequest){
        if (doctorRequest.getName().length() < 3)
            throw new IllegalArgumentException("Name should be atleast 3 character");
//        if (doctorRequest.getCity().name().length() > 20)
//            throw new
    }

}
