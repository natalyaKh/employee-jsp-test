$('.employeesTable').DataTable({
searching: false,
ordering: false,
lengthMenu: [ [4, 8, 12, -1], [4, 8, 12, "All"] ]
});

function deleteEmployee(id) {
  $.ajax({
    url: '/employee/' + id,
    type: 'DELETE',
    async: true,
    success: function (resp) {
      console.log(resp + " deleted")
    },
    error: function (resp) {
      var error = JSON.parse(resp.responseText);
      console.log(error.error)
      alert(error.error)
    }
  })
}

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
    console.log($('#timer').text());
    var t = $('#timer').text();
    console.log(t);
    console.log((Date.parse(t)) + "  1")
    console.log(new Date().getTime()  + " 2")
    console.log(new Date(t).getTime() + " 3")
    // timeDifference = new Date().getTime() - new Date(response).getTime();
    timeDifference = new Date().getTime() - new Date(t).getTime();
    console.log(timeDifference);
    // $('#timer').textContent;
    getdate();
  }
  // }
  // });

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
    console.log(seconds + " sec")
    $("#timer").text(day + "/" + month + "/" + year + " " + hours + " : " + minutes + " : " + seconds);
    setTimeout(function () {
      getdate()
    }, 500);
  }
})





