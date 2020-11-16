<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Dashboard</title>
  </head>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
  box-sizing: border-box;
}

/* Create two equal columns that floats next to each other */
.column {
  float: left;
  width: 50%;
  padding: 10px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}
/* Style the buttons */
.btn {
  border: none;
  outline: none;
  padding: 12px 16px;
  background-color: #f1f1f1;
  cursor: pointer;
}

.btn:hover {
  background-color: #ddd;
}

.btn.active {
  background-color: #666;
  color: white;
}
</style>




<script>
// Get the elements with class="column"
var elements = document.getElementsByClassName("column");

// Declare a loop variable
var i;

// List View
function listView() {
  for (i = 0; i < elements.length; i++) {
    elements[i].style.width = "100%";
  }
}

// Grid View
function gridView() {
  for (i = 0; i < elements.length; i++) {
    elements[i].style.width = "50%";
  }
}

/* Optional: Add active class to the current button (highlight it) */
var container = document.getElementById("btnContainer");
var btns = container.getElementsByClassName("btn");
for (var i = 0; i < btns.length; i++) {
  btns[i].addEventListener("click", function() {
    var current = document.getElementsByClassName("active");
    current[0].className = current[0].className.replace(" active", "");
    this.className += " active";
  });
}
</script>
<script>
function myFunction() {
  var form = document.getElementById("posted")
  var originalContent = form.innerHTML
  form.innerHTML = "${dash.getSent()}"
  setTimeout(function() {
    form.innerHTML = originalContent
  }, 1000)
}

</script>
<style media="screen">

#heading {
margin: auto;
text-align: center;
width: 90%;
  font-size: 50px;
  color: white;
  background:linear-gradient(to right, #9C27B0, #E040FB);
height: auto;
padding: 10px;
border-radius: 40px;

border: 1px solid;
 padding: 10px;
 box-shadow: 5px 10px gray;
}

#msg {
margin: auto;
text-align: center;
width: 35%;
  font-size: 50px;
  color: white;
  background:linear-gradient(to right, #9C27B0, #E040FB);
height: auto;
padding: 10px;
border-radius: 40px;

border: 1px solid;
 padding: 10px;
 box-shadow: 5px 10px gray;
}

.form-inline {

  display: flex;
  flex-flow: row wrap;
  align-items: center;
}

.form-inline label {
  margin: 5px 10px 5px 0;
  font-size: 20px;
}

.form-inline input {
  border-radius: 20px;
  margin: 10px 10px 5px 0;
  padding: 10px;
  height: 100px;
  width: 250px;
  background-color: #fff;
  border: 1px solid #ddd;
}

.form-inline button {
  padding: 10px 20px;
  background-color: dodgerblue;
  border: 1px solid #ddd;
  color: white;
  cursor: pointer;
}

.form-inline button:hover {
  background-color: royalblue;
}

@media (max-width: 800px) {
  .form-inline input {
    margin: 10px 0;
  }

  .form-inline {
    flex-direction: column;
    align-items: stretch;
  }
}

.submit {
      cursor: pointer;
        border-radius: 5em;
        color: #fff;
        background: linear-gradient(to right, #9C27B0, #E040FB);
        border: 0;
        padding-left: 40px;
        padding-right: 40px;
        padding-bottom: 10px;
        padding-top: 10px;
        font-family: 'Ubuntu', sans-serif;

        font-size: 13px;
        box-shadow: 0 0 20px 1px rgba(0, 0, 0, 0.04);

    }
    
    .row p {
    
    font-size: 20px;
    }
</style>





  <body style="background-image: url('bg.jpg');">
<br>
<div id="heading">        ${dash.getWelcome()} ${name} ${dash.getTitle()}         </div>

<br><br>
<div id="msg">
  <form class="form-inline" action="post">
    <label for="message">${dash.getPostMsg()}</label>
    <input type="text" id="message" placeholder="${dash.getHint()}" name="message">

    <button class="submit" type="submit"><b>${dash.getPostButton()}</b></button>
  </form>
</div>



<div id="btnContainer">
  <button class="btn" onclick="listView()"><i class="fa fa-bars"></i> ${dash.getList()}</button>
  <button class="btn active" onclick="gridView()"><i class="fa fa-th-large"></i> ${dash.getGrid()}</button>
</div>
<br>


${posts }











  </body>
</html>
