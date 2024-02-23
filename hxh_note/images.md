![image-20240221145555103](./images.assets/image-20240221145555103.png)

```

#创建数据库用户dmsTest,并授予远程连接权限。
create user 'ithxh'@'%' identified by '@Hu982614'; 
#为dmsTest用户授权数据库所有权限。
grant all privileges on *.* to 'ithxh'@'%'; 
#刷新权限。
flush privileges; 
```

```
firewall-cmd --zone=public --add-port=3306/tcp --permanent
firewall-cmd --zone=public --add-port=80/tcp --permanent
firewall-cmd --zone=public --add-port=22/tcp --permanent
```

```
firewall-cmd --zone=public --add-port=3306/tcp --permanent
Warning: ALREADY_ENABLED: 3306:tcp
```

