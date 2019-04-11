*Задача № 1*: Объясните, как нужно изменить программу, чтобы вы могли получить доступ к атрибутам name/surname из Employee в классы Programmer, Accountant, Manager? Опишите все возможные варианты с кратким объяснением.
--
1 вар: атрибутам name/surname дать доступ public или protected
2 вар: перенести class Employee в подпакет models.implementations или наоборот те 3 класса перенести в пакет models

*Задача № 2*: Изменить классы Programmer, Accountant, Manager, чтобы при создании объекта Programmer, Accountant, Manager отображался вывод на экран: «Hello, I am a new programmer(accountant/manager)».
---
Изменил. 

*Дополнительно*: Что мы можем добавить в наш код, чтобы мы могли отобразить значение атрибута private age в классе App?
-- 
расширить класс App extends Employee ?