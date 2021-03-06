## TrumpGame

トランプゲーム

## Overview

1. トランプのカードを表すクラスを作成
2. トランプを管理するクラスを作成
3. ブラックジャックを追加

## Detail

1. トランプのカードを表すクラスを作成

 - ジョーカーは含めない

| プロパティ | 型 | 備考 |
| --- | --- | --- |
| mark | 列挙型 | ダイヤ(Diamonds)、ハート(Hearts)、クローバー(Clubs)、スペード(Spades) |
| number | 数値(1-13) | 1 は A、11 は J、12 は Q、13 は K |

2. トランプを管理するクラスを作成

 - カードの管理には、1で作成したカードクラスを使用する

| メソッド | 説明 |
| --- | --- |
| reset | トランプをリセットする |
| shuffle | 残りのトランプをシャッフルする |
| draw | カードを一枚引く |

3. ブラックジャックを追加

 - カードゲームにブラックジャックというゲームがある。 その点数計算を行う。 ２枚のカードを引数として受け取り、点数を数えて返すメソッドを作成する。 カードの点数は以下のとおり。

| カード | 点数 |
| --- | --- |
| A | 1 点または 11 点(どちらか都合のいい方にする) |
| J,Q,K | 10 点 |
| 2 ～ 10 | 数字通りの点数 |

### インターフェース

#### CUI