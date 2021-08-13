
$.ajax({
  url: 'https://jsonip.com/',
  type: 'GET',
  success: function (resp) {
    var outputText = 'ip: ' + resp.ip;
    console.log(resp.ip + " ip")
    $('#ip').append(outputText);
  }
})

$.ajax({
  type: "OPTIONS", url: "/", complete: function (x) {
    console.log(x.getResponseHeader("Date"));
  }
})

$(document).ready(function () {
  var timeDifference;

  window.onload = function () {
    var t = $('#timer').text();
    timeDifference = new Date().getTime() - new Date(t).getTime();
    getdate();
  }

  function setFirstZero(value) {
    if (value < 10) {
      value = "0" + value;
    }
    return value;
  }

  function getdate() {
    var servertime = new Date();
    servertime.setMilliseconds(servertime.getMilliseconds() - timeDifference);
    var day = setFirstZero(servertime.getDate());
    var month = setFirstZero(servertime.getMonth() + 1);
    var year = servertime.getFullYear();
    var hours = setFirstZero(servertime.getHours());
    var minutes = setFirstZero(servertime.getMinutes());
    var seconds = setFirstZero(servertime.getSeconds());
    $("#timer").text(day + "/" + month + "/" + year + " " + hours + " : " + minutes + " : " + seconds);
    setTimeout(function () {
      getdate()
    }, 500);
  }
})





