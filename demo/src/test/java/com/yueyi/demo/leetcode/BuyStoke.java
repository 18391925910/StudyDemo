package com.yueyi.demo.leetcode;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class BuyStoke {
  @Test
  void test(){
    int[] n= {1,2,2,3,1,6};
    log.info("max:{}",String.valueOf(maxProfit(n)));
  }
  public int maxProfit(int[] n) {
    int[] result=new int[n.length-1];
    for (int i=0;i<n.length-1;i++){
      int max=0;
      for (int j=i;j<n.length;j++){
        if (max<n[j]-n[i]) max =n[j]-n[i];
      }
      if(max<0) max =0;
      log.info("{}:{}",i,max);
      result[i]=max;
    }
    return Arrays.stream(result).max().getAsInt();
  }
}
