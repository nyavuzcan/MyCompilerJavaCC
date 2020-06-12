package test;

import java.util.Objects;

public class test {
static int a; static int b;
  public static void main(String[] args) {

    Customer customer = new Customer();
      customer.setAd("f");
    if ( !customer.getAd().equals("asd")    && Objects.nonNull(customer.getDataType()) && !customer.getDataType().equals("asdasd")){
      System.out.println("test basarili");
    }

  }


}

class testd{

}