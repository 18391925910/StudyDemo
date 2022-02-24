package com.yueyi.demo.leetcode;


import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ParenthesesGenerator {
  @Test
  void test(){
    int n = 3;
    parenthesesGenerate(n).forEach(log::info);
  }
   List<String> parenthesesGenerate(int n){
    List<String> res=new ArrayList<>();
    String[] tmp=new String[2*n];
    return null;
  }

}
