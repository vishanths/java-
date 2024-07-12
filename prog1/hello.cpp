#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node*next;
};
struct node*top=0;
void push(int value){
    struct node*newnode;
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=value;
    newnode->next=top;
    top=newnode;
}
void pop(){
    struct node*temp;
    temp=top;
    if(top==0){
        printf("Stack is empty");
    }
    else{
        printf("The popped value is %d\n",temp->data);
        top=top->next;
    }
}
void peek(){
    if(top==0){
        printf("Stack is empty");
    }
    else{
        printf("The top value of the stack is %d\n",top->data);
    }
}
void display(){
    struct node*temp;
    temp=top;
    if(top==0){
        printf("Stack is empty!");
    }
    else{
        printf("The values in stack are:\n");
        while(temp!=0){
            printf("%d\n",temp->data);
            temp=temp->next;
        }
        printf("%d\n",temp->data);
    }
}
void main(){
    push(2);
    push(3);
    push(5);
    pop();
    peek();
    display();
};
THIS IS PROGRAM FOR IMPLEMENTATION OF STACK USING LINKED LIST