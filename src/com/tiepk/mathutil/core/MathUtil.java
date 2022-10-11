/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tiepk.mathutil.core;

/**
 *
 * @author tiepk
 */
//đây là class mô phỏng lại các hàm dùng chung mọi class khác
// mô phỏng lại class tiện ích java.Math của JDK
//Phàm cái gì là đồ dùng chung, thường được 
public class MathUtil {

    public static final double PI = 3.141592653589793;

    //hàm tiện ích tính n! = 1.2.3....n
    //Lưu ý/quy ước:
    // - Không tính giai thừa số âm !!!
    //0! = 1! =1
    // Vì giai thừa tăng cựa nhanh, nên 21! đã vượt quá 18 số 0
    // tràn kiểu long
    // Ta ko tính 21! trở lên
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        

        if (n == 0 || n == 1) 
            return 1;
        

        //sống sót đến đây, sure n = 2...20!!!
        //CẤM KO SÀI ELSE NỮA KHI HÀM ĐÃ CÓ RETURN PHÍA TRƯỚC
        long product = 1;// biến cộng dồn, nhân dồn, biến con heo đất
        for (int i = 2; i <= n; i++) 
            product *= i;
        

        return product;

    }
}

//CODING CONVERTION: QUY TẮC VIẾT CODE CTY ÉP PHẢI THEO!!!!
//ALT-SHIFT-F CĂN CODE TỰ ĐỘNG, KO LẠM DỤNG

// TA SẼ HỌC SƠ VỀ KHÁI NIỆM TDD - TEST DRIVEN DEVELOPMENT
// LÀ KĨ THUẬT LẬP TRÌNH/ ÁP DỤNG CHO DÂN DEVELOPER DỂ GIA TĂNG
// CHẤT LƯỢNG CODE/GIẢM THIỂU CÔNG SỨC TÌM BUG/PHÁT HIỆN BUG SỚM
// TDD yêu cầu dev khi viết code/viết hàm/class phải viết luôn
// Các bộ kiểm thử/viết luôn các test case/viết luôn các đoạn
// Code dùng để thử hàm/class để kiễm tra tính đúng đán của hàm/class
//Viết code kèm với viết test cases
//Viết code có ý thức viết luôn phần kiểm thử code/hàm/class
// development driven                     test
//SAU KHI CÓ ĐC TÊN HÀM (CHỈ TÊN HÀM MÀ THÔI)
//TA VIẾT LUN CÁC TÌNH HUỒNG XÀI HÀM
//CHẤP NHẬN KHI CHẠY HÀM CHẠY SAI - DO CODE CHƯA XONG
//SAU ĐÓ TA TỐI ƯU/CHỈNH SỬA CODE ĐỂ ĐẢM BẢO CODE CHẠY ĐÚNG!!!
// QUÁ TRÌNH SAI - ĐÚNG - SAI - ĐÚNG diễn ra liên tục (cycle)
