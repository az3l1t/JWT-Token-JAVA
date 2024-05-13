# Регистрация и аунтефикация с помощью JWT-токенов. Есть две роли - USER,ADMIN. В будущем можно добавить модераторов и вип-роли.
При добавлении end-points можно в конфигурационном файле SecurityConfig изменять доступ к определенным end-points:
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/78604392-6531-4381-a067-e24661d541f0)
- Так же стоит обратить внимание на фильтр, который достает данные из токена и работает с ними. 
# Пользователи
Пользователей можно создавать через end-point регистрации, можно логиниться. USER,ADMIN. 
Все пользователи хранятся в базе данных, при желании можно добавить параметр UPDATE, чтобы не удалять бд при выключении сервера.
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/33242c62-73c6-4a67-b1e6-325f3780b8f4)
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/1c05ba4b-9ee7-479a-8ae5-e3cd03f477e6)
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/a7f0a8c8-d05d-4826-8612-0bc082d3c3d5)
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/1412a793-9722-404f-8feb-e91addad60fd)
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/ba5fc523-0dcf-43fc-a446-77937b3d064f)
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/7b95bbb9-52e1-4343-8fac-1a4b76df5d5b)
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/3921fe3a-1490-4c0d-b64b-cb82ac6286b2)
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/86230a22-2647-4ccf-a3ae-fe0526feeda3)
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/74879ac3-4edc-4b6b-b0b1-81fc8f837c9c)
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/d024be17-3e0b-44af-b496-b025db26136e)
![image](https://github.com/az3l1t/JWT-Token-JAVA/assets/126178814/419fde25-a9ce-4aef-a027-222db3011b6f)
![Uploading image.png…]()
