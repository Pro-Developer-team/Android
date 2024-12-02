// app_b.js
const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send('Welcome to App B!');
});

app.listen(3000, () => {
    console.log('App B is running on http://localhost:3000');
});
