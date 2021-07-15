# SpringTest
 1. Tổng quan Spring MVC

[Bài tập 1] Ứng dụng chuyển đổi tiền tệ
Mục tiêu


Luyện tập tạo và khởi chạy ứng dụng Spring MVC.

Điều kiện
Biết cách tạo và khởi chạy ứng dụng Spring MVC.

Mô tả bài toán
Xây dựng một trang web để chuyển đổi từ USD sang VNĐ với một tỉ giá cho trước. Tạo trang chủ chứa một form để nhập tỉ giá và lượng USD muốn chuyển đổi. Tạo Controller để thực hiện việc tính toán và hiển thị kết quả.

Hướng dẫn
Bước 1: Tạo dự án Spring MVC

Bước 2: Cấu hình dispatcher-servlet.xml

Bước 3: Cấu hình web.xml

Bước 4: Tạo Controller thực hiện việc tính toán

Bước 5: Tạo thư mục views bên trong thư mục WEB-INF

Bước 6: Cấu hình Artifacts

Bước 7: Cấu hình Tomcat

Bước 8: Chạy ứng dụng web

Bước 9: Truy cập đường dẫn http://localhost:8080/... và quan sát kết quả

[Bài tập 2] Ứng dụng Từ điển đơn giản
Mục tiêu
Luyện tập tạo và khởi chạy ứng dụng Spring MVC.

Điều kiện
Biết cách tạo và khởi chạy ứng dụng Spring MVC.

Mô tả bài toán
Xây dựng một trang web để tra cứu từ Anh – Việt (với các từ - nghĩa của từ cho sẵn trong một mảng). Tạo trang chủ chứa một form tra cứu từ. Nếu tìm thấy từ thì hiển thị nghĩa bằng tiếng việt. Nếu không tìm thấy thì hiển thị thông báo không tìm thấy.

Hướng dẫn
Bước 1: Tạo dự án Spring MVC

Bước 2: Cấu hình dispatcher-servlet.xml

Bước 3: Cấu hình web.xml

Bước 4: Tạo Controller xử lý tra cứu từ điển

Bước 5: Tạo thư mục views bên trong thư mục WEB-INF

Bước 6: Cấu hình Artifacts

Bước 7: Cấu hình Tomcat

Bước 8: Chạy ứng dụng web 

Bước 9: Truy cập đường dẫn http://localhost:8080/... và quan sát kết quả

2. Spring Controller

[Thực hành 1] Ứng dụng kiểm tra email hợp lệ sử dụng Maven
Mục tiêu
Luyện tập sử dụng Controller trong Spring MVC.

Điều kiện
Biết cách sử dụng Controller trong Spring MVC.

Mô tả
Trong phần này, chúng ta sẽ xây dựng một ứng dụng cho phép kiểm tra tính hợp lệ của một email.

Ứng dụng cho phép người dùng nhập vào một email, nhấn nút kiểm tra và sẽ hiển thị thông báo kết quả.

Một email hợp lệ phải đạt những yêu cầu sau:

Bắt đầu bằng một ký tự

Không chứa các ký tự đặc biệt

Có một ký tự @ ngăn cách tên email và domain

Domain phải hợp lệ

[Thực hành 2] Ứng dụng xem giờ hiện tại của các thành phố sử dụng Maven
Mục tiêu
Luyện tập sử dụng Controller trong Spring MVC.

Mô tả
Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép hiển thị thời gian hiện tại của các thành phố lớn trên thế giới.

Ứng dụng hiển thị một danh sách các thành phố cho sẵn trong Combobox, cho phép người dùng chọn lựa một thành phố và sau đó hiển thị thời gian của thành phố được lựa chọn.

[Bài tập 1] Ứng dụng hiển thị gia vị với Sandwich
Mục tiêu
Luyện tập sử dụng Controller trong Spring MVC.

Điều kiện
Biết cách sử dụng Controller trong Spring MVC.

Mô tả
Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép hiển thị các gia vị đi kèm với món Sandwich.

Ứng dụng hiển thị một danh sách các gia vị dạng checkbox, cho phép người dùng chọn lựa một hoặc nhiều gia vị ăn kèm với Sanwich và sau đó hiển thị danh sách các gia vị đã lựa chọn đó.

Giao diện ứng dụng có thể như sau:



Hướng dẫn
Bước 1: Tạo dự án Spring MVC

Bước 2: Cấu hình dispatcher-servlet.xml

Bước 3: Cấu hình web.xml

Bước 4: Tạo Controller


Để tiếp nhận các mục lựa chọn sử dụng đối số của phương thức trong controller như sau


@RequestMapping(“/save”)
public String save(@RequestParam(“condiment”) String[] condiment) {
            …
}
Trong đó: condiment là tên của các checkbox

Bước 5: Tạo thư mục views bên trong thư mục WEB-INF

Bước 6: Cấu hình Artifacts

Bước 7: Cấu hình Tomcat

Bước 8: Chạy ứng dụng web 

Bước 9: Truy cập đường dẫn http://localhost:8080/... và quan sát kết quả

[Bài tập 2] Máy tính cá nhân
Mục tiêu
Luyện tập sử dụng Controller trong Spring MVC.

Điều kiện
Biết cách sử dụng Controller trong Spring MVC.

Mô tả
Tạo một ứng dụng máy tính đơn giản để thực hiện các phép tính đơn giản. Ứng dụng sẽ có giao diện như sau:




Hướng dẫn:
Bước 1: Tạo dự án Spring MVC

Bước 2: Cấu hình dispatcher-servlet.xml

Bước 3: Cấu hình web.xml

Bước 4: Tạo Controller xử lý tính toán

Bước 5: Tạo thư mục views bên trong thư mục WEB-INF

Bước 6: Tạo file index.html trong thư mục view và khai báo Form

Bước 7: Cấu hình Artifacts

Bước 8: Cấu hình Tomcat

Bước 9: Chạy ứng dụng web 

Bước 10: Truy cập đường dẫn http://localhost:8080/... và quan sát kết quả






