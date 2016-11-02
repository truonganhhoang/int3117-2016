from unittest import TestCase
from solver import Solver


class TestSolver(TestCase):
    def test_get_most_popular_word_wn1(self):
        sentence = "Smile! Smile! Please!"
        output = Solver.get_most_popular_word(sentence)
        expected_output = "Smile!"
        self.assertEqual(output, expected_output)

    def test_get_most_popular_word_wn2(self):
        sentence = "This is madness. This is Sparta!"
        output = Solver.get_most_popular_word(sentence)
        expected_output = "is"
        self.assertNotEqual(output, expected_output)

    def test_get_most_popular_word_wr1(self):
        sentence = ""
        output = Solver.get_most_popular_word(sentence)
        expected_output = None
        self.assertEqual(output, expected_output)

