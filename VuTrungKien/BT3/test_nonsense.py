from unittest import TestCase
from nonsense import is_x_more_dangerous_than_y


class TestNonsense(TestCase):
    def test_is_x_more_dangerous_than_y_TC1(self):
        actual_output = is_x_more_dangerous_than_y(1, 1, 1)
        expected_output = False
        self.assertEqual(actual_output, expected_output)

    def test_is_x_more_dangerous_than_y_TC2(self):
        actual_output = is_x_more_dangerous_than_y(1, 2, 1)
        expected_output = False
        self.assertEqual(actual_output, expected_output)

    def test_is_x_more_dangerous_than_y_TC3(self):
        actual_output = is_x_more_dangerous_than_y(1, 2, 9000)
        expected_output = False
        self.assertEqual(actual_output, expected_output)

    def test_is_x_more_dangerous_than_y_TC4(self):
        actual_output = is_x_more_dangerous_than_y(1, 2, -9000)
        expected_output = True
        self.assertEqual(actual_output, expected_output)
