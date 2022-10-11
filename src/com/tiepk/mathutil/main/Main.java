/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiepk.mathutil.main;

import com.tiepk.mathutil.core.MathUtil;

/**
 *
 * @author tiepk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This statement comes from the main() method");
        tryTDDFirst();
        //testFactorialGivenWrongArgumentThrowsException();
    }
    
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        //              hàm đc thiết kế ném về ngoại lệ!!!
        //Thấy ngoại lệ mừng rơi nước mắt khi đưa vào -5
        //thấy ngoại lệ xuất hiện như kì vọng -> passed cái test -> màu xanh
        System.out.println("Hope to see the Expected| Illegal Argument Exception");
        MathUtil.getFactorial(-5);
    }
    
    
    // hàm này đc viết ra để dùng thử kĩ thuật viết code kiểu TDD
    // gọi thử/dùng thử hàm chính bên core/bên MathUtil
    
    public static  void tryTDDFirst() {
        
        //Test case #1 (tình huống kiểm thử hàm số 1/xài thử hàm ):
        //- Input: n = 1;
        //- Gọi hàm getFactorial(1)
        //- Hy vọng hàm trả vế 1, v1 1! = 1
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        // so sánh expected vs. actual coi chúng nó giống nhau hem?
        // giống -> hàm đúng với case đang test
        // sai -> bug rồi!!! với case đang test
        System.out.println("Test 1! | status: " +
                                    "Expected: " + expected +
                                    " | Actual: " + actual);
        
        
        
        //Test case #2 (tình huống kiểm thử hàm số 2/xài thử hàm ):
        //- Input: n = 2;
        //- Gọi hàm getFactorial(2)
        //- Hy vọng hàm trả vế 2, v1 2! = 2
        System.out.println("Test 2! | status: " +
                                    "Expected: 2 " +
                                    " | Actual: " + MathUtil.getFactorial(2));
        
    }
    
}
//TEST CASE LÀ GÌ?
// LÀ 1 tình hướng xài app/kiểm thử app/kiểm thử tính năng/màn hình
//Chức năng/xử lí của app
//Test case là tình hướng kiểm thử app/chức năng mà khi đó
// ta phải
//- đua vào data giá/mẫu/test;
//- đưa ra giá trị kì vọng ta mong chờ app trả về
// sau đó chờ hàm/tính năng xử l1 xong trả về kết quả!!!
// và ta nhìn thấy và ta 