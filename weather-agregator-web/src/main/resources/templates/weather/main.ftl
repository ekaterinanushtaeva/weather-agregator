<html>
   <head>
      <script src="/webjars/jquery/3.3.1/dist/jquery.min.js"></script>
      <script src="/webjars/Materialize/0.96.0/dist/js/materialize.min.js"></script>
      <script src="/webjars/vue/2.5.16/vue.min.js"></script>
      <script src="https://ssense.github.io/vue-carousel/js/vue-carousel.min.js"></script>
      <script src="/js/main/main.js"></script>
      <script src="/js/weather/main.js"></script>
      <link rel="stylesheet" href="/webjars/Materialize/0.96.0/dist/css/materialize.min.css"/>
      <link rel="stylesheet" href="/css/main/main.css"/>
      <link rel="stylesheet" href="/css/weather/main.css"/>
   </head>
   <body>
   <div class="row">
      <div id="yahoo-block" class="col l3 s10">
         <h1 class="center-align">Yahoo</h1>
         <carousel :per-page="1" :pagination-enabled="false" :navigation-enabled="true" :navigation-next-label="'<i>></i>'"
            :navigation-prev-label="'<i><</i>'">
            <#list weatherList as weather>
            <slide>
               <span class="label">
                  <h3>${weather.day}</h3>
                  <h4>${weather.date}</h4>
                  <h1>${weather.temperature}℃</h1>
                  <div class="row valign-wrapper">
                     <div class="col l8 s4">
                        <img src="http://dummyimage.com/200x200/f0f/fff" alt="" class="responsive-img"> <!-- здесь будет картинка с состоянием погоды -->
                     </div>
                     <div class="col s8">
                        <h4>
                           ${weather.description}
                        </h4>
                     </div>
                  </div>
               </span>
            </slide>
            </#list>
         </carousel>
      </div>
      <div class="col l2">
      </div>
       <div class="col l2">
      </div>
      </div>
   </body>
</html>