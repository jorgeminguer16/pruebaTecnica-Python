from flask import Blueprint
from api.source import get_source

controller = Blueprint('controller', __name__, url_prefix='/api')


@controller.route('test', methods=['GET'])
def api():
    source = get_source()
    return source
