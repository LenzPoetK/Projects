const form = document.querySelector("form");
const InName = document.querySelector(".name");
const InEmail = document.querySelector(".email");
const InPassword = document.querySelector(".password");

function signUp(){
    fetch("http://localhost:8080/users", {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            user_name: InName.value,
            user_email: InEmail.value,
            user_password: InPassword.value
        })
    })
    .then(function(res) {
        return res.json();
    })
    .then(function(data) {
        console.log(data);
    })
    .catch(function(error) {
        console.log(error);
    });
};

function clear(){
    InName.value = "";
    InEmail.value = "";
    InPassword.value = "";
};

form.addEventListener('submit', function(event){
    event.preventDefault();
    signUp();
    clear();
});