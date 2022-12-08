from dataclasses import dataclass, asdict
from typing import List
from datetime import datetime


@dataclass
class Item:
    id: int
    categories: List[str]
    created_at: datetime
    icon_url: str
    updated_at: datetime
    url: str
    value: str

    def dict(self) -> dict:
        return asdict(self)
