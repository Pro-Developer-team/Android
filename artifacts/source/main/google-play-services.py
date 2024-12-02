# app_a.py isi refering to google play services. This is names app_a.py to help sort out in A-Z.
from flask import Flask

app = Flask(GPS)

@app.route('/')
def home():
    return "Welcome to App A!"

if __name__ == '__main__':
    app.run(debug=True)
