def makeTree(entry_order, to_escape, depth_dict: dict, depth: int):
    center_index = int(len(entry_order) / 2)
    if center_index == 0 or center_index == to_escape:
        return None
    left_center_index = int(len(entry_order[0:center_index]) / 2)
    right_center_index = int(((center_index + 1) + len(entry_order) - 1) / 2)
    try:
        depth_dict[depth].extend([entry_order[left_center_index], entry_order[right_center_index]])
    except KeyError:
        depth_dict[depth] = [entry_order[left_center_index], entry_order[right_center_index]]
    makeTree(entry_order[0:center_index], to_escape, depth_dict, depth + 1)
    makeTree(entry_order[center_index + 1:], to_escape, depth_dict, depth + 1)

def main():
    k = int(input()); del k
    entry_order = list(map(int, input().split()))
    depth_dict = dict()
    depth_dict[0] = [entry_order[int(len(entry_order) / 2)]]
    makeTree(entry_order, len(entry_order) - 1, depth_dict, 1)
    for i in depth_dict.keys(): 
        for j in depth_dict[i]:
            print(j, end=" ")
        print()

if __name__ == '__main__':
    main()