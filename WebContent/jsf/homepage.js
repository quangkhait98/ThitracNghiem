$(document).ready(function(){
	$(document).on('click', '#lop', function(){
			var lop ="";
			lop = lop + 'Lớp : ' + $(this).find("input[type=hidden][id$='tenLop']").val();
			$('.lop').empty();
			$('.lop').text(lop);
			
			var tenbaithi ="";
			tenbaithi = tenbaithi + 'Tên bài thi : ' + $(this).find("input[type=hidden][id$='tenbode']").val();
			$('.tenbaithi').empty();
			$('.tenbaithi').text(tenbaithi);
			
			var thoigianbatdau ="";
			thoigianbatdau = thoigianbatdau + 'Thời gian bắt đầu : ' + $(this).find("input[type=hidden][id$='tgbd']").val();
			$('.thoigianbatdau').empty();
			$('.thoigianbatdau').text(thoigianbatdau);
			
			var thoigianketthuc ="";
			thoigianketthuc = thoigianketthuc + 'Thời gian kết thúc : ' + $(this).find("input[type=hidden][id$='tgkt']").val();
			$('.thoigianketthuc').empty();
			$('.thoigianketthuc').text(thoigianketthuc);
			
			var thoigianlambai ="";
			thoigianlambai = thoigianlambai + 'Thời gian làm bài : ' + $(this).find("input[type=hidden][id$='tglb']").val();
			$('.thoigianlambai').empty();
			$('.thoigianlambai').text(thoigianlambai);
			$('#mabd').val($(this).find("input[type=hidden][id$='mabode']").val())
			$('#exampleModal').modal('show');
	     });
	

	
});

