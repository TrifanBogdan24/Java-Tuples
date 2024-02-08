# Tuples

In Java, un tuplu este o colectie care poate contine
mai multe tipuri date in acelasi timp.

Spre exemplu, o pereche poate fi formata dintr-un `String` si un `Integer`,
iar alta, dintr-un `Integer` si un `Double`.

Tuplurile lucreaza cu tipuri generice de date, deci cu obiecte, cu clase,
in niciun caz cu tipuri primitve de date, precum: `byte`, `short`, `int`, `long`, `float`,
`double`, `char` sau `boolean`.


Totusi, in Java, pentru fiecare tip primitiv de date,
exista o `clasa wrapper` corespunzatoare, care incapsualeaza
acel tip primitiv intr-un obiect.
Aceste `clase wrapper` sunt folosite, de obicei, in situatii
in care este necesare sa se trateze tipuri primitave ca obiecte:
- `class Byte`
- `class Short`
- `class Long`
- `class Float`
- `class Double`
- `class Character`
- `class Boolean`



Revenind la `tuple`, acesta este o colectie care incorporeaza
mai multe tipuri de date.

Spre exemplu, avem o functie pentru care ne dorim sa returneze
simultan un `Integer` si un `ArrayList` de o clasa specifica.

Stiind ca se poate returna doar un singur obiect/ instanta/ valoare,
putem intoarce o instanta unui tuplu pereche care sa contine datele dorite.
