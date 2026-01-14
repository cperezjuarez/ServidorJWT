<img src="https://docencia.xaviersastre.cat/Moduls/DWES/img/Spring_Boot_Documentation_Header_1200x200px_with_Xavier_Sastre_Mug_and_Logo_ajustat.png" alt="drawing"/>


[![Desenvolupat amb Spring-Boot](https://img.shields.io/badge/Desenvolupat%20amb-SpringBoot-green?&logo=springboot&logoColor=white)](https://github.com/xsastre)
[![per en](https://img.shields.io/badge/per%20en-xsastre-red)](https://github.com/xsastre)
[![Desenvolupat al des-2025](https://img.shields.io/badge/Desenvolupat%20al-des--2025-yellow)](https://github.com/xsastre)

Amb powershell per registrar usuari

```shell
curl.exe -v -X POST http://localhost:8080/api/auth/register -H "Content-Type: application/json" -H "Accept: application/json" -d '{"username":"nomUsuari","password":"contrasenya123","email":"correu@exemple.com"}'^C
```

Per fer login
```shell
curl.exe -v -X POST http://localhost:8080/api/auth/login -H "Content-Type: application/json" -H "Accept: application/json" -d '{"username":"nomUsuari","password":"contrasenya123"}'
```
