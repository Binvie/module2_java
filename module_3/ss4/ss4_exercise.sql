use student_management;

SELECT address, COUNT(student_id) AS 'Số lượng học viên'
FROM student
GROUP BY address;

SELECT S.student_id,S.student_name, AVG(mark)
FROM student S join mark M on S.student_id = m.student_id
GROUP BY S.student_id, S.student_name;

SELECT S.student_id,S.student_name, AVG(mark)
FROM student S join mark M on S.student_id = m.student_id
GROUP BY S.student_id, S.student_name
HAVING AVG(mark) > 9;

SELECT S.student_id,S.student_name, AVG(mark)
FROM student S join mark M on S.student_id = m.student_id
GROUP BY S.student_id, S.student_name
HAVING AVG(mark) >= ALL (SELECT AVG(mark) FROM mark GROUP BY mark.student_id);

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.

select *
from `subject` 
where credit in (select max(credit) from `subject` );

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.

select *
from `subject` s
join mark m on m.sub_id = s.sub_id
where mark in (select max(mark) from mark );

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần

select *, avg(m.mark) as diem_trung_binh
from student
join mark m on m.student_id = student.student_id
join `subject` s on s.sub_id = m.sub_id
group by student.student_id;
