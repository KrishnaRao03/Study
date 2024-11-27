const $ = (selector) => document.querySelector(selector);

const processEntries = () => {
    const subtotal = parseFloat($('#subtotal').value.trim());
    const taxRate = parseFloat($('#taxRate').value.trim());

    if (isNaN(subtotal) || subtotal <= 0 || subtotal >= 10000) {
        alert('Subtotal must be > 0 and < 10000');
        $('#subtotal').focus();
        return;
    }

    if (isNaN(taxRate) || taxRate <= 0 || taxRate >= 12) {
        alert('Tax Rate must be > 0 and < 12');
        $('#taxRate').focus();
        return;
    }

    const salesTax = (subtotal * taxRate) / 100;
    const total = subtotal + salesTax;

    $('#salesTax').value = salesTax.toFixed(2);  
    $('#total').value = total.toFixed(2);      

};

const clearEntries = () => {
    $('#subtotal').value = ''; 
    $('#taxRate').value = '';  
    $('#salesTax').value = '';
    $('#total').value = '';     
    $('#subtotal').focus();    
};


document.addEventListener('DOMContentLoaded', () => {
    $('#calculate').addEventListener('click', processEntries);  
    $('#clear').addEventListener('click', clearEntries); 
    $('#subtotal').addEventListener('click', () => ($("#subtotal").value = ""));   
    $('#taxRate').addEventListener('click', () => ($("#taxrate").value = ""));    

    $('#subtotal').focus();  
});
