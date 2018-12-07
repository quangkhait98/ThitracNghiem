$(document).ready(function() {
  var myevents = [];	
  $.ajax({
	  cache: true,
	  url: "calendar",
	  dataType: "json",
	  type: "GET",
	  success: function(response) {	  
		  for(var i = 0 ; i < response.length;i++)
		  {
		  	myevents.push({
		  		  id:response[i].id,
                  start: response[i].start,
                  end: response[i].end,
                  allDay: false,
                  title: response[i].title,
                  tgian:response[i].tglambai,
              });
		  }  
		$('#calendar').fullCalendar({
		header: {
			left: 'title',
			center: '',
			right: 'today,month,agendaDay,agendaWeek prev,next',
			  },
			  editable: true,
			  minTime: 0,
			   maxTime: 24,
			   timeFormat: 'H:mm',
			  events: myevents,
			  eventClick: function(calEvent, jsEvent, view) {
				  var string = calEvent.title;
				  var leng = string.length;
				  var temp= string.search(":");
				  var tenlop="";
				  var tenbode="";
				  tenlop = tenlop + string.slice(0,temp-1);
				  tenbode=tenbode+ string.slice(temp+2,leng);
				  var lop ="";
					lop = lop + 'Lớp : ' + tenlop;
					$('.lop').empty();
					$('.lop').text(lop);
					
					var tenbaithi ="";
					tenbaithi = tenbaithi + 'Tên bài thi : ' + tenbode;
					$('.tenbaithi').empty();
					$('.tenbaithi').text(tenbaithi);
					
					var thoigianbatdau ="";
					thoigianbatdau = thoigianbatdau + 'Thời gian bắt đầu : ' + $.fullCalendar.formatDate(calEvent.start, 'YYYY/MM/DD HH:mm');
					$('.thoigianbatdau').empty();
					$('.thoigianbatdau').text(thoigianbatdau);
					
					var thoigianketthuc ="";
					thoigianketthuc = thoigianketthuc + 'Thời gian kết thúc : ' + $.fullCalendar.formatDate(calEvent.end, 'YYYY/MM/DD HH:mm');
					$('.thoigianketthuc').empty();
					$('.thoigianketthuc').text(thoigianketthuc);
					
					var thoigianlambai ="";
					thoigianlambai = thoigianlambai + 'Thời gian làm bài : ' + calEvent.tgian;
					$('.thoigianlambai').empty();
					$('.thoigianlambai').text(thoigianlambai);
					$('#mabd').val(calEvent.id);
					$('#exampleModal').modal('show');
				  }
		});
	  }
	});
});

