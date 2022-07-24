import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor() { }

  authenticate(username, password) {
    if (username === "admin" && password === "password") {
      sessionStorage.setItem('username', username)
      return true;
    } else {
      alert("Invalid Credentials")
      return false;
    }
  }

  authenticate1(username, password) {
    if (username === "user" && password === "password") {
      sessionStorage.setItem('username', username)
      return true;
    } else {
      return false;
    }
  }

  isUserLoggedIn() {
    let admin = sessionStorage.getItem('username')
    console.log(!(admin === null))
    return !(admin === null)
  }

  logOut() {
    sessionStorage.removeItem('username')
    alert("Logout Successfull!!");
  }
  
}
