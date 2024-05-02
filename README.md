# SpotifyData
  SpotifyData é uma API com o objetivo de coetar dados do Spotify.
  Usuário pode:
  * Fazer uma pesquisa por artista, álbum ou música.
  * Identificar um artista, álbum por meio de seu ID.

## Endpoints
### Pesquisa
* /spotify/api/search/artist
* /spotify/api/search/album
* /spotify/api/search/track

No corpo da requisição, o usuário deve fazer a pesquisa desejada como no Json a seguir

```Json
{
  "q": "(pesquisa)",
  "type": "(tipoDaPesquisa)"
}
```
Sendo a variável "q" a pesquisa e "type" o tipo da pesquisa. Possíveis valores para o 
tipo de pesquisa são "artist" para artistas, "album" para albuns e "track" para músicas.
