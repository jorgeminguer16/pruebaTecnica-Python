import requests
from api.serializer import Item


def get_source() -> list:
    ids = []
    items = []

    for i in range(25):
        response = requests.get('https://api.chucknorris.io/jokes/random')
        item = Item(**response.json())

        if item.id not in ids:
            ids.append(item.id)
            items.append(item.dict())
    return items
