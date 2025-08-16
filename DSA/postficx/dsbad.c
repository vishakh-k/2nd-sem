#include <stdio.h>
#include <stdlib.h>

#define MAX 5
int queue[MAX];
int front = -1, rear = -1;

void enqueue() {
    int item;
    if (rear == MAX - 1) {
        printf("\nQueue Overflow\n");
        return;
    }
    printf("Enter a value: ");
    scanf("%d", &item);
    if (front == -1) {
        front = 0;  
    }
    queue[++rear] = item;
    printf("Enqueued %d\n", item);
}

void dequeue() {
    if (front == -1 || front > rear) {
        printf("Queue Underflow\n");
        return;
    }
    int item = queue[front];
    front++;
    if (front > rear) {
        front = rear = -1;
        printf("Queue is now empty after deleting %d\n", item);
    } else {
        printf("Deleted item is %d\n", item);
    }
}

void display() {
    if (front == -1) {
        printf("Queue is empty\n");
        return;
    }
    printf("Queue elements: ");
    for (int i = front; i <= rear; i++) {
        printf("%d ", queue[i]);
    }
    printf("\n");
}

int main() {
    int choice;
    printf("Queue Implementation\n");
    printf("1. Enqueue\n2. Dequeue\n3. Display\nAny other key to Exit\n");

    while (1) {
        printf("Enter your choice: ");
        if (scanf("%d", &choice) != 1) {
            printf("Invalid input. Exiting.\n");
            break;
        }
        switch (choice) {
            case 1:
                enqueue();
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            default:
                printf("Exiting...\n");
                exit(0);
        }
    }
    return 0;
}
