package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;



class GetDistinctStringsImplTest {
    @Test
    public void uniqueStringTest(){
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        List<String> Uniqueset = obj1.get.distinctStrings(new ArrayList<>(Arrays.asList("java","java","c")));
        List<String> strList= new ArrayList<>();
        strList.add("c");
        strList.add("java");

        Assertions.assertEquals(strList,Uniqueset);
    }
     @Test
    public void similarStringTest() {
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        List<String> Uniqueset = obj1.get.distinctStrings(new ArrayList<>(Arrays.asList("java", "java", "c")));
        List<String> strList = new ArrayList<>();
        strList.add("c");
        strList.add("c");
        Assertions.assertNotEquals(strList, Uniqueset);

    }




    @Test
    public void checkForNull() {
        GetDistinctStringsImpl obj1 = new GetDistinctStringsImpl();
        Assertions.assertThrows(NullPointerException.class, () -> {
            obj1.get.distinctStrings(new ArrayList<>(Arrays.asList(null)));
        });



    }

}


