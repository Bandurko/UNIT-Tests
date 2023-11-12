import pytest

from task import NumbersLists

@pytest.fixture
def list1():
    return [1, 2, 3, 4, 5]


@pytest.fixture
def list2():
    return [7, 8, 9, 10, 11]


def test_init(list1, list2):
    nums_list = NumbersLists(list1, list2)
    assert nums_list.lst1 == list1
    assert nums_list.lst2 == list2


def test_lists_averages(list1, list2):
    nums_list = NumbersLists(list1, list2)
    assert nums_list.num_lists_averages() == (3, 9)


@pytest.mark.parametrize('lst1, lst2, result', [([1, 2, 3], [], (2, 0)), ([], [1, 2, 3], (0, 2)), ([], [], (0, 0))])
def test_empty_lists_averages(lst1, lst2, result):
    nums_list = NumbersLists(lst1, lst2)
    assert nums_list.num_lists_averages() == result


@pytest.mark.parametrize('lst1, lst2, result', [([1, 2, 3], [5], (2, 5)), ([5], [1, 2, 3], (5, 2)), ([5], [5], (5, 5))])
def test_one_elemented_lists_averages(lst1, lst2, result):
    nums_list = NumbersLists(lst1, lst2)
    assert nums_list.num_lists_averages() == result


def test_first_list_average_more(list1, list2, capfd):
    nums_list = NumbersLists(list2, list1)
    nums_list.compare_averages()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Первый список имеет большее среднее значение'


def test_second_list_average_more(list1, list2, capfd):
    nums_list = NumbersLists(list1, list2)
    nums_list.compare_averages()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Второй список имеет большее среднее значение'


def test_equal_lists_averages(list1, capfd):
    nums_list = NumbersLists(list1, list1)
    nums_list.compare_averages()
    captured = capfd.readouterr()
    assert captured.out.strip() == 'Средние значения равны'