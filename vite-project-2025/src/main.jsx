// // FETCH API
// const apiKey = "D9n0H1elB7UefwYGtEfLMTmI2p2Tk2xf";
// const peticion = fetch(`http://api.giphy.com/v1/gifs/random?api_key=${apiKey}`);


// peticion
//   .then((resp) => resp.json())
//   .then(({ data }) => {
//     const { url } = data.images.original;
//     const img = document.createElement("img");
//     img.src = url;
//     document.body.append(img);
//   })
//   .catch(console.warn);

import React from 'react'
import ReactDOM from 'react-dom/client'
 import App from './App';
import App2 from './App2';
import MyButton from './assets/Button';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App2/>
    <App/>
<MyButton/>


  </React.StrictMode>
);