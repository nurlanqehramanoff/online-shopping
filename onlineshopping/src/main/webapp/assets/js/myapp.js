$(function() {
	
	//solve the active menu problem
	switch (menu) {
	case "About Us":
		$('#about').addClass("active");
		break;
	case "Contact us":
		$('#contact').addClass("active");
		break;
	case "home":
		$('#home').addClass("active");
		break;
	default:
		break;
	}
})