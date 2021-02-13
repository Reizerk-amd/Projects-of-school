import unittest


from hola import *

class testoperaciones(unittest.TestCase):
    def setUp(self):
        return super().setUp()

        pass
    #Son funciones que las puedes llamar en cualquier otro trabajo de programacion
    #puess maso osea puedes crear un bloque de codigo y luego llamarlo en otro programa
    def test_suma(self):
        esperado = 3
        actual = suma(1,2)

        self.assertEqual(actual,esperado)

    def test_multiplicacion(self):
        esperado = 50
        actual= multiplicacion(10,5)

        self.assertEqual(actual, esperado)

    def test_resta(self):
        esperado = 5
        actual = resta(10,5)

        self.assertEqual(actual,esperado)

    def test_division(self):
        esperado = 6
        actual= division(12,2)

        self.assertEqual(actual,esperado)

    def tearDown(self) :
            pass


if __name__ == "__main__":
    unittest.main()