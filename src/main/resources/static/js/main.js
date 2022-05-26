(function($) {

	"use strict";

	$('[data-toggle="tooltip"]').tooltip()

})(jQuery);


let n1 = 0; 
let n2 = 0; 
let n3 = 0; 

document.querySelectorAll(".btn-primary").forEach(
	(element,i) => {
		element.addEventListener('click', (e)=>handleClick(e,i));
	})

	const handleClick = (e,i) => {
		if (i==0) {
			n1++;
			alert(n1);
		} else {
			if (i==1) {
				n2++;
				alert(n2);
			} else {
				n3++;
				alert(n3);
			}
		}
		window.location.href = "../../templates/Views/gracias.html";
	}
