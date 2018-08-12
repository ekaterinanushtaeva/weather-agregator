$(document).ready(function(){
//ToDo вынести в main в отдельный метод
new Vue({
	el: '#yahoo-block',
  components: {
  	'carousel': VueCarousel.Carousel,
    'slide': VueCarousel.Slide
  },
});
});