package com.yueyi.demo.leetcode;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ClimbStairs {
  @Test
  void test(){
    int n = 5;
    List<String> s=new ArrayList<>();
    climb(n,0,s);
    s.forEach(log::info);
  }
  void climb(int n,int pos, List<String> s){
    climb(n-1,0,s);
    climb(n-2,0,s);
  }
}
