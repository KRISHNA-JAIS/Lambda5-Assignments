package com.knoldus.distinctString;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

        public class DistinctStringTestClass {

        //       test cases that should be passes :
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "scala", "java", "clojure", "clojure"));
        List<String> stringList2 = new ArrayList<>(Arrays.asList("the", "three", "the", "three", "the", "three","an","an","a"));

        @Test
        public void mustReturnDistinctString(){
            List<String> expected1 = Arrays.asList("clojure","java","scala");
            List<String> expected2 = Arrays.asList("a","an","the","three");

            List<String> distinctList1= DistinctStringApplicationClass.getDistinctStrings(stringList);
            List<String> distinctList2= DistinctStringApplicationClass.getDistinctStrings(stringList2);

            Assert.assertEquals(expected1,distinctList1);
            Assert.assertEquals(expected2,distinctList2);
        }
    }