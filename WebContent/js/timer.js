function startTimer(duration, display) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	var timer = duration, hours, minutes, seconds;
	setInterval(function() {
		
		hours = parseInt(timer / (60 * 60), 10)
		minutes = parseInt(timer % (60 * 60) / 60, 10)
		seconds = parseInt(timer % 60, 10);
		hours = hours < 10 ? "0" + hours : hours;
		minutes = minutes < 10 ? "0" + minutes : minutes;
		seconds = seconds < 10 ? "0" + seconds : seconds;

		display.textContent = hours + ":" + minutes + ":" + seconds;

		if (--timer < 0) {
			clearInterval(x);
			document.getElementById("clock").innerHTML = "Hết thời gian";
		}
	}, 1000);
}

$(document).ready(function() {
	var time = document.getElementById("clock").innerHTML,
	h = time.split(':')[0],
	m = time.split(':')[1],
	duration = h*60*60 + m*60,
	display = document.querySelector('#clock');
	startTimer(duration, display);
});
=======
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
=======
>>>>>>> parent of c216beb... phan lop
    var timer = duration, minutes, seconds;
    setInterval(function () {
        minutes = parseInt(timer / 60, 10)
        seconds = parseInt(timer % 60, 10);

        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = minutes + ":" + seconds;

        if (--timer < 0) {
            timer = duration;
        }
    }, 1000);
}

window.onload = function () {
    var time = 60 * 45,
        display = document.querySelector('#time');
    startTimer(time, display);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
};
>>>>>>> parent of c216beb... phan lop
=======
};
>>>>>>> parent of c216beb... phan lop
=======
};
>>>>>>> parent of c216beb... phan lop
=======
};
>>>>>>> parent of c216beb... phan lop
=======
};
>>>>>>> parent of c216beb... phan lop
