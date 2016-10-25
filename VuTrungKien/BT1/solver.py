class Solver(object):
    @staticmethod
    def get_most_popular_word(sentence):
        """
        Returns:
            str
                A word which has the highest frequency in sentence,
        order the tied words alphabetically.

        Parameters:
            sentence: str
                Input sentence, case-sensitive.
        """
        word_dictionary = {}
        sorted_word_list = []

        words = sentence.split()
        for word in words:
            if word in word_dictionary:
                word_dictionary[word] += 1
            else:
                word_dictionary[word] = 1

        for word, count in word_dictionary.iteritems():
            sorted_word_list.append((word, count))

        sorted_word_list.sort(key=lambda tup: (-tup[1], tup[0]))

        most_popular_word = sorted_word_list[0][0] if len(sorted_word_list) else None

        return most_popular_word
