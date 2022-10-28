_ = None

input_count = _
escape_loop_with_no_return = _

map_list = list()
visited_stack = list()
print_houses_list = list()

map_list_x_index = 0
map_list_y_index = 0
house_complex_count = 0
houses_count = 0
house_on = 1
house_off = 0

def exception_handling(node):
    global input_count, map_list_x_index, map_list_y_index
    if node in visited_stack:
        return True
    if node[0] == input_count or node[0] < 0:
        return True
    if node[1] == input_count or node[1] < 0:
        return True

def run_dfs(node):
    global escape_loop_with_no_return, visited_stack, map_list, houses_count
    if exception_handling(node):
        return escape_loop_with_no_return
    visited_stack.append(node)
    if map_list[node[0]][node[1]] == house_off:
        return escape_loop_with_no_return
    else:
        houses_count += 1
        run_dfs((node[0] - 1, node[1]))
        run_dfs((node[0], node[1] + 1))
        run_dfs((node[0] + 1, node[1]))
        run_dfs((node[0], node[1] - 1))

def run_loop_for_dfs():
    global map_list_y_index, map_list_x_index, input_count, houses_count, house_complex_count, print_houses_list
    while map_list_y_index < input_count:
        while map_list_x_index < input_count:
            run_dfs((map_list_y_index, map_list_x_index))
            if houses_count != 0:
                print_houses_list.append(houses_count)
                house_complex_count += 1
            houses_count = 0
            map_list_x_index += 1
        map_list_y_index += 1
        map_list_x_index = 0

def print_answer():
    print_houses_list.sort()
    print(house_complex_count)
    for i in print_houses_list:
        print(i)

def list_input():
    global input_count, map_list
    input_count = int(input())
    for i in range(input_count):
        map_list.append(list(map(int, input())))

def main():
    list_input()
    run_loop_for_dfs()
    print_answer()

if __name__ == '__main__':
    main()