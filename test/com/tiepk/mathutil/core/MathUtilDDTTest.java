/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiepk.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.tiepk.mathutil.core.MathUtil.*;
import org.junit.Assert;

/**
 *
 * @author tiepk
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //1. Chuẩn bị bộ data là mảng 2 chiều, 2 cột ứng với Expected và n
    // dòng ứng với test case
    //mảng Object, số thì dùng Wrapper class - class gói các primitive
    //Integer -> int, long -> long
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25}; // liệt kê các phần tử mảng ách nhau
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};

        /* int c[][] = {{1, 0},
                    {1, 1},
                    {2, 2},
                    {6, 3},
                    {24, 4},
                    {120, 5},
                    {720, 6}
                    };*/
        return new Integer[][]{{1, 0},
                                {1, 1},
                                {2, 2},
                                {6, 3},
                                {24, 4},
                                {120, 5},
                                {720, 6}
                                };
    }

    //ta sẽ map/ánh xạ các cột của mỗi dòng, ví dụ dòng đầu tiên
    //có 2 cột là 1 0 -> ta sẽ ánh xạ 1 vào biến Expected, 0 vào biến n
    @Parameterized.Parameter(value = 0)
    public long expected;// map vào cột 0 của mảng

    @Parameterized.Parameter(value = 1)
    public int n; // map vào cột 1 cảu mảng

    @Test//kiểm thử các test case với data dc trích ra từ mảng map
    // vào 2 biên tương ứng
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n));
    }
}

//Phân tích cách ta viết code cho test cho phần test getF() hôm trước
//hàm/method. Lệnh này lặp đi lặp lại cho các datat đưa vào
// để ta kiểm tra các tình huồng xài hàm/test case
//Lát hồi ta thay data 1 0 thành các data tương ứng khác
//Ví dụ
//Expected      n!
//1             0 -> có ổn ko
//1             1
//2             2
//6             3
//24            4
//120           5
//720           6
//...
//Nếu ta có dc cách nào đó, mà tách đám data ra riêng 1 chỗ
//SAU ĐÓ TỪ TỪ NHÒI/MÓM/FEED DATA NÀY VÀO CÂU LỆNH TEST HÀM Ở TRÊN
//COI NHƯ CHỈ CẦN 1 LỆNH GỌI LÀ TEST HÀM, DATA CỨ THẾ TUẦN TỰ ĐẨY VÀO,
//KĨ THUẬT TÁCH DATA RA KHỎI CÁC CÂU LỆNH TEST, SAU ĐÓ NHÒI NÓ VÔ
//CÁI CÂU LỆNH TET, GIÚP RÚT RỌN SỐ CÂU LỆNH TEST, GIUP DỄ DÀNG
//KIỄM TRA TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE
//KĨ THUẬT NÀY GOI TÊN LÀ DDT - DATA DRIVEN TESTING
//VIẾT CODE kiểm thử hướng theo tách data
//CÒN GỌI 1 TÊN KHÁC LÀ: KIỂM THỬ THEO KIỂU THAM SỐ HÓA - PARAMETERIZE
//DẤU  ??? o CÂU LỆNH gọi là hàm chính là tên biến sẽ dùng để nhận
//data từ tập data đã tách ra - CONVERT DATA THÀNH BIẾN
//Chới với DDT ta cần
//Bộ data test - tách riêng
//Các tham số ứng với bộ data - chính là các biến dùng data ra
//Gọi là kiểm thử xài các hàm số

//Toàn bô code trong class này dc viết ra dùng để test code chính ở
// BÊN SRC PACKAGE
//CODE ĐC VIẾT RA DÙNG ĐỂ TEST CODE KHÁC
//THÌ CODE NÀY DC GỌI LÀ TEST SCRIPT
//1 TEST SCRIPT SẼ CÓ NHIỀU CODE ĐỂ TEST HÀM CHÍNH
//1 TEST SCRIPT SE CHỨ NHIỀU TEST CASE
//                          TEST CASE: CÁC TÌNH HUỐNG XÀI HÀM
//1 TEST SCRIPT CÓ THỂ XÀI DDT ĐỂ BẢO TRÌ CODE TEST
//VIẾT VIẾT CODE CHÍNH CÓ THỂ XÀI TDD



