<html>
   <head>
      <script src="/webjars/jquery/3.3.1/dist/jquery.min.js"></script>
      <script src="/webjars/Materialize/0.96.0/dist/js/materialize.min.js"></script>
      <script src="/webjars/vue/2.5.16/vue.min.js"></script>
      <script src="/js/weather/main.js"></script>
      <link rel="stylesheet" href="/webjars/Materialize/0.96.0/dist/css/materialize.min.css"/>
      <link rel="stylesheet" href="/css/main/main.css"/>
   </head>
   <body>
      <div class="row">
         <div class="col l3">
            <#list weatherList as weather>
            <div class="card white darken-1">
               <div class="card-content gray-text center">
                  <div class="row">
                     <div class="col l5">
                        <!--Здесь будет картинка с логотипом--!>
                        <img src="https://www.w3schools.com/howto/img_snow.jpg" alt="" class="responsive-img"/>
                        <br>
                        <br>
                        <!--Здесь будет картинка с состоянием погоды--!>
                        <img src="https://www.w3schools.com/howto/img_snow.jpg" alt="" class="responsive-img col s12"/>
                     </div>
                     <div class="col l6">
                        <h3>${weather.day}</h3>
                        <h5>${weather.date}</h5>
                        <h2 class="brown-text">${weather.temperature}℃</h2>
                        <h5>${weather.description}</h5>
                     </div>
                  </div>
               </div>
            </div>
            </#list>
         </div>
         <div class="col l1">
         </div>
         <div class="col l1">
         </div>
      </div>
   </body>
</html>