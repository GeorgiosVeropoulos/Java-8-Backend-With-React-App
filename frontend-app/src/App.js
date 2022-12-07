import React,{useEffect, useState} from 'react';
import './App.css';
import axios from 'axios';

function App() {
const [firstName, setFirstName] = useState("");
const [lastName, setLastName] = useState("");
const [email, setEmail] = useState("");
const [getuser, setGetUser] = useState([]);

let handleSubmit = async(e) => {
  await e.preventDefault();
  if(firstName === "" || lastName === "" || email === "") {
    alert("Please fill all the fields");
    return;
  }
  else{
    axios.post('/create', {
      firstName: firstName,
      lastName: lastName,
      email: email
    })
  }
  
  
  setFirstName("");
  setLastName("");
  setEmail("");
};

  useEffect(() => {
    axios.get('/users')
    .then((response) => {
      setGetUser(response.data);
    })
  })




  return (
    <div className="App">
      <div>
      <form onSubmit={handleSubmit}>
        <input type="text" placeholder="First Name" value={firstName} onChange={(e) => setFirstName(e.target.value)} />
        <input type="text" placeholder="Last Name" value={lastName} onChange={(e) => setLastName(e.target.value)} />
        <input type="text" placeholder="Email" value={email} onChange={(e) => setEmail(e.target.value)} />
        <button type="submit">Submit</button>
        
      </form>
      </div>
      <div>
      <ul>
          {getuser.map((user) => <li>
            {user.firstName} {user.lastName} {user.email}
          </li>)}
      </ul>
      </div>
      
    </div>
  );
}

export default App;
