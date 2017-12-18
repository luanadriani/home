$(function() {
	$('.js-toggle').bind('click', function(event) {
		$('.js-sidebar, .js-content, .aw-topbar').toggleClass('is-toggled');
		event.preventDefault();
	});	
});

$(function() {
	$('.js-content').bind('click', function(event) {
		$('.js-sidebar, .js-content, .aw-topbar').removeClass('is-toggled');
		event.preventDefault();
	});	
});
