from flask import Flask
from api.api import controller

app = Flask(__name__)
app.register_blueprint(controller)

if __name__ == '__main__':
    app.run()
